package edu.cnm.deepdive.shuffler;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class ShufflerTest {

  @Test
  void shuffle_ints() {
    int[] data = IntStream.range(0, 1_000_000)
        .toArray();
    Set<Integer> check = IntStream.of(data)
        .boxed()
        .collect(Collectors.toSet());
  }

}