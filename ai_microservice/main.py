from fastapi import FastAPI, UploadFile
import whisper
from transformers import pipeline
import tempfile

app = FastAPI()

# Load models once when server starts
whisper_model = whisper.load_model("base")
sentiment_model = pipeline("sentiment-analysis")

@app.post("/analyze")
async def analyze(file: UploadFile):

    # save uploaded file temporarily
    with tempfile.NamedTemporaryFile(delete=False) as temp:
        temp.write(await file.read())
        temp_path = temp.name

    # speech to text
    result = whisper_model.transcribe(temp_path)
    text = result["text"]

    # sentiment analysis
    sentiment = sentiment_model(text)

    return {
        "transcript": text,
        "sentiment": sentiment[0]["label"],
        "score": sentiment[0]["score"]
    }