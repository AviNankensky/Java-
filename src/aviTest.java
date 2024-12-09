public double longestDistance() {
    if (_noOfBoxes < 2) {
        return 0;
    }
    double maxDistance = 0;
    for (int i = 0; i < _noOfBoxes; i++) {
        for (int j = i + 1; j < _noOfBoxes; j++) {
            double distance = _boxes[i].distance(_boxes[j]);
            if (distance > maxDistance) {
                maxDistance = distance;
            }
        }
    }
    return maxDistance;
}
