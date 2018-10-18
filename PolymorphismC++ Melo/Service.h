#pragma once

#include <string>
#include <string.h>
#include <iostream>

using namespace std;

class Service {
public:
	virtual void serviceName();
	virtual string provider();
	virtual bool useKeyboard();
	virtual void can();
private:

};