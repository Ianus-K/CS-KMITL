from __future__ import division
from __future__ import print_function

import random
import functools

_PRIME = 1597

_RINT = functools.partial(random.SystemRandom().randint, 0)

def _eval_at(poly, x, prime):
    accum = 0
    for coeff in reversed(poly):
        accum *= x
        accum += int(coeff)
        accum %= prime
    return accum

def make_random_shares(secret, minimum, shares, prime=_PRIME):
    if minimum > shares:
        raise ValueError("Pool secret would be irrecoverable.")
    poly = [secret] + [_RINT(prime - 1) for i in range(minimum - 1)]
    points = [(i, _eval_at(poly, i, prime))
              for i in range(1, shares + 1)]
    return points

def main():
    """Main function"""
    secret = input('Enter your secret:')
    shares = make_random_shares(secret, minimum = int(input('Minimal number of codes used to decrypt:')), shares = int(input('How many do you want to share? :')))

    print('Secret:', secret)
    print('Shares:')
    if shares:
        for share in shares:
            print('  ', share)

if __name__ == '__main__':
    main()