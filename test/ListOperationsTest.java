package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class ListOperationsTest {

    ListOperations obj;
    @Before
    public void setUp() throws Exception {
        obj = new ListOperations();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void addNamesTest() {
        List<String> list2 = asList("Melon","Mango");
        assertEquals(list2,obj.addNames(new String[]{"Melon","Mango"}));
        List<String> list1 = asList("Namita,Pratima");
        assertEquals(list1,obj.addNames(new String[]{"Namita,Pratima"}));
    }
}
