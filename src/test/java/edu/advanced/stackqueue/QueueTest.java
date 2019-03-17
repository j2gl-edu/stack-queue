package edu.advanced.stackqueue;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class QueueTest {

    private Queue queue;

    @Before
    public void setUp() {
        queue = new Queue();
        queue.add(1);
    }

    @Test
    public void testAdd() {
        queue.add(2);
        int actual = queue.peek();

        assertThat(1, is(actual));
        assertThat(2, is(queue.getSize()));
    }

    @Test
    public void testPoll() {
        assertThat(false, is(queue.isEmpty()));
        int actual = queue.poll();
        assertThat(1, is(actual));
        assertThat(true, is(queue.isEmpty()));
    }

    @Test
    public void testPeek() {
        int actual = queue.peek();
        assertThat(1, is(actual));
    }

    @Test
    public void testIsEmpty() {
        assertThat(false, is(queue.isEmpty())ß);
        queue.poll();
        assertThat(true, is(queue.isEmpty()));
    }

}