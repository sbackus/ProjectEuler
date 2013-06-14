#!/usr/bin/perl

# Samuel Backus
#May 9, 2009

print "content-type: text/html \n\n";

#projecteuler.net Problem 6
#What is the difference between the sum of the
#squares and the square of the sums?

$sumOfSqu = 0;
$squOfSum = 0;
$sum = 0;
$start =1;
$end = 100;

for($i = $start; $i <= $end; $i++){
  $sumOfSqu += $i**2;
  $sum += $i;
}
$squOfSum = $sum**2;
print ($squOfSum);
print ("\n");
print ($sumOfSqu);
print ("\n");
print ($squOfSum - $sumOfSqu);