package test;

import junit.framework.TestCase;
import main.week5.date221019.MyStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest extends TestCase {

    @Test
    public void testPush() {
        MyStack stack = new MyStack(10);
        stack.push(1);
    }

}