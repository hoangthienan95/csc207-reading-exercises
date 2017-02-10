T’(0) = 0
T’(n) = 1 + T(n-2)

Expand the recurrence a few steps, since n is even, we have

T’(n) = 1 + T(n-2) = 1 +(1 + T(n-4)) ….

Let k be the number of expansions (or unfoldings) that we perform on the function.
Rewriting T(n) in terms of k, we have:

T'(n) = k + T(n-2k)

Consider the case when n = 0. This is when 2k = n so we have 

T'(n) = n/2 + T(0) = n/2

Therefore T takes linear time with respect to its input.

Our big-O bound doesn't change if instead of subtracting 1 or 2, we subtract any constant k, since this would only change the coefficient before the n term and not change the order of the big-O bound.

