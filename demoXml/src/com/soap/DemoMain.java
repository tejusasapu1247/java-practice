package com.soap;

import javax.xml.ws.Endpoint;

public class DemoMain {
public void main(String [] args) {
	Calculator cal=new Calculator();
	Endpoint.publish("http://localhost:8090/calapp", cal);
}
}
