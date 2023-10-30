public double estimate_pi(int n) {
  double num_points_circle = 0;
  double num_points_square = 0;
  for (int i = 0; i < n; i++) {
    double x = Math.random();
    double y = Math.random();
    double distance = Math.pow(x, 2) + Math.pow(y, 2);
    if (distance <= 1) {
      num_points_circle += 1;
    }
    num_points_square += 1;
  }
  return 4 * num_points_circle / num_points_square;
}
