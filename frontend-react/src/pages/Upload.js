import React, { useState } from "react";
import API from "../services/api";

function Upload() {

    const [file, setFile] = useState(null);
    const [agentName, setAgentName] = useState("");
    const [message, setMessage] = useState("");

    const handleUpload = async () => {

        if (!file || !agentName) {
            setMessage("Please select file and enter agent name");
            return;
        }

        const formData = new FormData();
        formData.append("file", file);
        formData.append("agentName", agentName);

        try {
            await API.post("/calls/upload", formData, {
                headers: {
                    "Content-Type": "multipart/form-data"
                }
            });

            setMessage("Upload Successful ✅");

            setTimeout(() => {
                window.location.href = "/dashboard";
            }, 1000);
        } catch (err) {
            console.log(err);
            setMessage("Upload Failed ❌");
        }
    };

    return (
        <div className="container mt-5">
            <h2>Upload Call Audio</h2>

            <input
                type="text"
                className="form-control mb-3"
                placeholder="Agent Name"
                onChange={(e) => setAgentName(e.target.value)}
            />

            <input
                type="file"
                className="form-control mb-3"
                accept=".wav"
                onChange={(e) => setFile(e.target.files[0])}
            />

            <button
                className="btn btn-success"
                onClick={handleUpload}
            >
                Upload
            </button>

            <p className="mt-3">{message}</p>
        </div>
    );
}

export default Upload;