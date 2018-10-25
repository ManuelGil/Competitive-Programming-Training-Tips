<?php

public static function Radix(&$data, $count) 
{
	for ($shift = 31; $shift > -1; $shift--)
	{
		$j = 0;
		for ($i = 0; $i < $count; $i++)
		{
			$move = ($data[$i] << $shift) >= 0;

			if ($shift == 0 ? !$move : $move)
				$data[$i - $j] = $data[$i];
			else
				$temp[$j++] = $data[$i];
		}

		for ($i = 0; $i < $j; $i++)
		{
			$data[($count - $j) + $i] = $temp[$i];
		}
	}

	$temp = null;
}
