package com.zs.hobbies.cache;

import com.zs.hobbies.dto.Badminton;
import com.zs.hobbies.dto.Chess;
import com.zs.hobbies.dto.Travelling;
import com.zs.hobbies.dto.VideoWatching;

/**
 * This class is represent Object in LRU Cache
 */
public class Node {
    private String key;
    private Badminton badminton;
    private Travelling travelling;
    private Chess chess;
    private VideoWatching videoWatching;

    private Node previous , next;

    public Node(){
        badminton = null;
        travelling = null;
        chess = null;
        videoWatching = null;
    }

    /**
     * set the badminton object
     * @param badminton badminton object which you want to insert in LRU Cache
     */
    public Node(Badminton badminton) {
        key = String.valueOf(badminton.getPersonId()) + "_badminton";
        this.badminton = badminton;
    }

    /**
     * set the travelling object in node
     * @param travelling travelling object which you want to insert in LRU Cache
     */
    public Node(Travelling travelling) {
        key = String.valueOf(travelling.getPersonId()) + "_travelling";
        this.travelling = travelling;
    }

    /**
     * set the chess object in node
     * @param chess chess object which you want to insert in LRU Cache
     */
    public Node(Chess chess) {
        key = String.valueOf(chess.getPersonId()) + "_chess";
        this.chess = chess;
    }

    /**
     * set the videoWatching object in node
     * @param videoWatching videoWatching object which you want to insert in LRU Cache
     */
    public Node(VideoWatching videoWatching) {
        key = String.valueOf(videoWatching.getPersonId()) + "_videoWatching";
        this.videoWatching = videoWatching;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Badminton getBadminton() {
        return badminton;
    }

    public void setBadminton(Badminton badminton) {
        this.badminton = badminton;
    }

    public Travelling getTravelling() {
        return travelling;
    }

    public void setTravelling(Travelling travelling) {
        this.travelling = travelling;
    }

    public Chess getChess() {
        return chess;
    }

    public void setChess(Chess chess) {
        this.chess = chess;
    }

    public VideoWatching getVideoWatching() {
        return videoWatching;
    }

    public void setVideoWatching(VideoWatching videoWatching) {
        this.videoWatching = videoWatching;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
