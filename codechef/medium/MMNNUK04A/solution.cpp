            .orElseThrow(() -> 
                new UserNotFoundException("User not found with id: " + id)
            );

        // Step 2: Update email
        user.setEmail(updatedUser.getEmail());

        User user = userRepository.findById(id)
        // Step 1: Find user by id
        // Step 3: Save updated user

    public User updateUserEmail(@PathVariable Long id, @RequestBody User updatedUser) {
        return userRepository.save(user);
    }
}