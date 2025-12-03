import math

def sq_dist_origin(point):
    x, y = point
    return x**2 + y**2

def find_closest_to_origin(points):
    sq_dists = list(map(sq_dist_origin, points))
    i = sq_dists.index(min(sq_dists))
    return points[i]

points = [(1,1), (1,2), (2,1), (2,2)]
print(find_closest_to_origin(points))