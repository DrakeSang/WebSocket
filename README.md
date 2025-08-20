# WebSocket
WebSocket simple app exercise

What is WebSocket?

WebSocket is a communication protocol that provides full duplex(two-way) communication between a client(like a web browser) and a server over single, long-lived connection. This means:

1) Once the connection is eastablished, both the client and the server can send and receive data at any time.
2) Unlike HTTP(HyperText Transfer Protocol), where the client always has to request and the server responds, WebSockets allow real-time, bidirectional communication.

How does it differ from HTTP?

| Feature       | HTTP                                 | WebSocket                                            |
| ------------- |------------------------------------- | -----------------------------------------------------|
| Communication | One-way per request                  | Two-way full duplex                                  |
| Connection    | Open -> Request -> Response -> Close | Open -> Keep alive -> Both sides communicate freely  |
| Overhead      | High (each request has headers)      | Low (once connected, it's a lightweight data stream) |
| Use case      | Static or request-based content      | Real-time, interactive content                       |

What do we use WebSockets for?

WebSockets are perfect when real-time updates are needed. Common use cases include:

1) Live notifications(e.g Facebook, Gmail)
2) Chat applications(e.g WhatsApp Web, Slack)
3) Real-time dashboards or stock tickers
4) Multiplayer online games
5) Collaboration apps(e.g Google Docs)

How does it work?

1) Client initiates a WebSocket handshake using HTTP.
2) If the server supports it, it upgrades the connection to a WebSocket.
3) Now, they can send messages back and forth freely.

Article on how to use binance WebSocket API: https://academy.binance.com/en/articles/how-to-use-binance-websocket-api#Key-Takeaways
