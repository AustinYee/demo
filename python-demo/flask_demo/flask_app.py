import json

from flask import Flask

import flask_app2 as app2

app = Flask(__name__)


@app.route('/')
def hello_world():
    return 'Hello, World!'


@app.route('/getJson')
def get_json_data():
    data = {"name": "changqing", "age": 11}
    return json.dumps(data)


if __name__ == '__main__':
    app.run()
    print(app2.a)
