package com.oft.android

/**
 * Provides the capability to return the string "foo"
 * [impl->req~android.string-return~1]
 */
class FooProvider {
    companion object {
        /**
         * Returns the string "foo" as specified
         * [impl->req~android.string-return~1]
         */
        fun returnFoo(): String {
            return "foo"
        }
    }
} 