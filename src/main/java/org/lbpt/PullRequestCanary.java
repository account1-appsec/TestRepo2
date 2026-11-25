package org.lbpt;

import java.util.Locale;

public final class PullRequestCanary {
    private PullRequestCanary() {
    }

    public static String normalizeRepositoryName(String owner, String repository) {
        if (owner == null || repository == null) {
            throw new IllegalArgumentException("owner and repository are required");
        }
        return owner.trim().toLowerCase(Locale.ROOT) + "/"
                + repository.trim().toLowerCase(Locale.ROOT);
    }
}
