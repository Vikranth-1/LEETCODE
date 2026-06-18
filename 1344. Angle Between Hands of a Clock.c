double angleClock(int hour, int minutes) {
    double hourAngle = (hour % 12) * 30.0 + minutes * 0.5;
    double minuteAngle = minutes * 6.0;

    double diff = hourAngle - minuteAngle;
    if (diff < 0)
        diff = -diff;
    if (diff > 180.0)
        diff = 360.0 - diff;
    return diff;
}
