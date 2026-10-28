# Java Security Demos

Small Java exercises for hashing, HMAC, input bounds, CSV-based detection rules, and a localhost client/server request simulation.

## Compile and run

Compile a demo from this directory with `javac FileName.java`, then run it with `java ClassName`.

- `MD5CollisionDemo` reads `file1.der` and `file2.der` from the current directory.
- `MAC_Hash_HMAC` demonstrates SHA-256 and HMAC-SHA256.
- `BufferOverflowSimulation` demonstrates a bounded character array using ordinary Java checks.
- `BotnetDetection` reads `dataset.csv`; its rules are illustrative only.
- `SimpleServer` and `DoSSimulator` are intended to run locally on `localhost:5000`. Start the server first.
