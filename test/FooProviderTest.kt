package com.oft.android

import org.junit.Test
import org.junit.Assert.assertEquals

/**
 * Test suite for the FooProvider class
 * [utest->req~android.string-return~1]
 */
class FooProviderTest {
    /**
     * Verifies that the returnFoo function returns "foo" as specified
     * [utest->req~android.string-return~1]
     */
    @Test
    fun testReturnFoo() {
        assertEquals("foo", FooProvider.returnFoo())
    }
} 