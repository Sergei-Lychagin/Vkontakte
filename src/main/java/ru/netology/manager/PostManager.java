package ru.netology.manager;

import ru.netology.domain.WallPost;

public class PostManager {

    private WallPost[] posts;

    public WallPost[] searchPosts(
            int ownerId,
            String domain,
            String query,
            boolean ownersOnly,
            byte count,
            int offset) {
        // TODO: add logic
        return null;
    }

    public void deletePost(int ownerId, int postId) {
        // TODO: add logic
    }
}