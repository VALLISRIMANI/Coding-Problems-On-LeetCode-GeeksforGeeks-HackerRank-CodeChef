        if (originalUrl == null) {
            // If URL not found, return 404 Not Found
            return ResponseEntity.notFound().build();
        }

        // TODO: Create a Redirect Response (HTTP 302)
        // Hint: Use URI.create() to convert the string URL to a URI object
        return ResponseEntity.status(302)
                .location(URI.create(originalUrl))
                .build();
    }
}

