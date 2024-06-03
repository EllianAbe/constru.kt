#!/bin/bash

# Post "Hello!"
curl -X POST http://localhost:8081 \
     -H "Content-Type: application/json" \
     -d '{"text": "Hello!"}'

# Post "Bonjour!"
curl -X POST http://localhost:8081 \
     -H "Content-Type: application/json" \
     -d '{"text": "Bonjour!"}'

# Post "Privet!"
curl -X POST http://localhost:8081 \
     -H "Content-Type: application/json" \
     -d '{"text": "Privet!"}'

# Get all the messages
curl -X GET http://localhost:8081
