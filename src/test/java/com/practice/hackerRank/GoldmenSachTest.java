package com.practice.hackerRank;

import com.paper.hackerrank.GoldmenSach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by akasshukla on 10/22/16.
 */
public class GoldmenSachTest {

    @Test
    public void path() throws Exception {
        GoldmenSach d = new GoldmenSach();
         Assertions.assertEquals(6,d.path(3, 3));
    }

}