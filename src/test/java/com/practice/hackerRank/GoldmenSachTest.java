package com.practice.hackerRank;

import com.paper.hackerrank.GoldmenSach;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by akasshukla on 10/22/16.
 */
public class GoldmenSachTest {

    @Test
    public void path() throws Exception {
        GoldmenSach d = new GoldmenSach();
         Assert.assertEquals(6,d.path(3, 3));
    }

}