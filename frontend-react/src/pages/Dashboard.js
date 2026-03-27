import React, { useEffect, useState } from "react";
import API from "../services/api";
import { PieChart, Pie, Cell, Tooltip, Legend } from "recharts";

const COLORS = ["#00C49F", "#FF4C4C", "#FFBB28"];

function Dashboard() {

    const [data, setData] = useState([]);

    const fetchData = () => {
        API.get("/analytics/sentiment")
            .then(res => setData(res.data))
            .catch(err => console.log(err));
    };

    useEffect(() => {
        fetchData();
    }, []);

    return (
        <div className="container mt-5">

            <h2 className="mb-4">Sentiment Analytics Dashboard</h2>

            <a href="/upload" className="btn btn-primary mb-4">
                Upload New Call
            </a>

            {data.length === 0 ? (
                <p>No Data Found</p>
            ) : (
                <div className="d-flex justify-content-center">
                    <PieChart width={400} height={400}>
                        <Pie
                            data={data}
                            dataKey="count"
                            nameKey="sentiment"
                            cx="50%"
                            cy="50%"
                            outerRadius={120}
                            label
                        >
                            {data.map((entry, index) => (
                                <Cell key={`cell-${index}`} fill={COLORS[index % COLORS.length]} />
                            ))}
                        </Pie>
                        <Tooltip />
                        <Legend />
                    </PieChart>
                </div>
            )}
        </div>
    );
}

export default Dashboard;