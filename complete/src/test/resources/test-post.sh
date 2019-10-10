#!/bin/bash
curl -X POST localhost:9090 -d @./test.json --header "Content-Type: application/json"
