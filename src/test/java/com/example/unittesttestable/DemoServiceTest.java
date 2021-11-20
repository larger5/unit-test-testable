package com.example.unittesttestable;

import com.alibaba.testable.core.annotation.MockInvoke;
import org.junit.jupiter.api.Test;

public class DemoServiceTest {

    public static class Mock {
        // 放置Mock方法的地方
        @MockInvoke(targetClass = String.class)
        public String substring(int beginIndex, int endIndex) {
            return "IT小村";
        }
    }

    @Test
    public void getStringTest() {
        System.out.println(DemoService.getString());
    }

}
