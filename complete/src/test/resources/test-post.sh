#!/bin/bash
curl -X POST localhost:8080 -d @./test.json --header "Content-Type: application/json"