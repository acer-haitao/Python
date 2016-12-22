#!/usr/bin/python
# -*- coding: UTF-8 -*-

import socket
import sys

#创建socket对象
clientsocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

#获取本地主几名
host = socket.gethostname()
port = 999;



clientsocket.connect((host, port))
print clientsocket.recv(1024)
clientsocket.close()



