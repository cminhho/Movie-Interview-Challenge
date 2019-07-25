package com.exercise.movie.shared.rest.error;

import java.net.URI;

public final class ErrorConstants {

    public static final String ERR_CONCURRENCY_FAILURE = "error.concurrencyFailure";
    public static final String ERR_VALIDATION = "error.validation";
    public static final URI DEFAULT_TYPE = URI.create("/problem-with-message");

    private ErrorConstants() {
    }
}
