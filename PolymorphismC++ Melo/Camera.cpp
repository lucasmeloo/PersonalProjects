#include <string>
#include <iostream>
#include "Camera.h"

void Camera::serviceName() {
	std::cout << "Camera" << std::endl;
	return;
}
void Camera::save() {
	std::cout << "Pictures Saved" << std::endl;
	return;
}
void Camera::load() {
	std::cout << "Pictures loaded" << std::endl;
	return;
}