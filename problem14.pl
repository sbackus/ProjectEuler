# http://projecteuler.net/index.php?section=problems&id=14
# Project Euler 14
# Sam Backus
# Feb 13 2010

    #!/usr/bin/perl
    use strict;
    use warnings;
	
	use constant MAX => 1000000;
	use constant BIGMAX => MAX * 1000;
	
	my @knownSequenceLengths = (1..BIGMAX);
	 for my $index (1..BIGMAX)
    {
        $knownSequenceLengths[$index] = 0;
    }

	sub getLength{
		my $startNum = $_[0];
		#print "this is $startNum \n";
		if ($knownSequenceLengths[$startNum] != 0){
			return $knownSequenceLengths[$startNum];
		}
		if ($startNum == 1){
			return 1;
		}
		if ($startNum % 2 == 0){
			my $length = getLength($startNum/2) + 1;
			$knownSequenceLengths[$startNum] = $length;
			return $length;
		}
		if ($startNum % 2 != 0){
			my $length = getLength(3 * $startNum + 1) + 1;
			$knownSequenceLengths[$startNum] = $length;
			return $length;
		}
	}
	
	for my $index (1..MAX)
    {
        getLength($index);
    }
	
	for my $index (1..MAX)
    {
        #print "$index   $knownSequenceLengths[$index] \n";
    }