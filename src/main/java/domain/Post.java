package domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String postType;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private int canEdit;
    private int isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private int postponedId;
    private Like likesInfo;
    private Comment commentInfo;
    private Copyright copyrightInfo;
    private Donut donutInfo;
    private Follower followerInfo;
    private Geo geoInfo;
    private Information informationInfo;
    private Placeholder placeholderInfo;
    private PostSource postSourceInfo;
    private Reclame reclameInfo;
    private Repost repostInfo;
    private Views viewsInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public Like getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(Like likesInfo) {
        this.likesInfo = likesInfo;
    }

    public Comment getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(Comment commentInfo) {
        this.commentInfo = commentInfo;
    }

    public Copyright getCopyrightInfo() {
        return copyrightInfo;
    }

    public void setCopyrightInfo(Copyright copyrightInfo) {
        this.copyrightInfo = copyrightInfo;
    }

    public Donut getDonutInfo() {
        return donutInfo;
    }

    public void setDonutInfo(Donut donutInfo) {
        this.donutInfo = donutInfo;
    }

    public Follower getFollowerInfo() {
        return followerInfo;
    }

    public void setFollowerInfo(Follower followerInfo) {
        this.followerInfo = followerInfo;
    }

    public Geo getGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(Geo geoInfo) {
        this.geoInfo = geoInfo;
    }

    public Information getInformationInfo() {
        return informationInfo;
    }

    public void setInformationInfo(Information informationInfo) {
        this.informationInfo = informationInfo;
    }

    public Placeholder getPlaceholderInfo() {
        return placeholderInfo;
    }

    public void setPlaceholderInfo(Placeholder placeholderInfo) {
        this.placeholderInfo = placeholderInfo;
    }

    public PostSource getPostSourceInfo() {
        return postSourceInfo;
    }

    public void setPostSourceInfo(PostSource postSourceInfo) {
        this.postSourceInfo = postSourceInfo;
    }

    public Reclame getReclameInfo() {
        return reclameInfo;
    }

    public void setReclameInfo(Reclame reclameInfo) {
        this.reclameInfo = reclameInfo;
    }

    public Repost getRepostInfo() {
        return repostInfo;
    }

    public void setRepostInfo(Repost repostInfo) {
        this.repostInfo = repostInfo;
    }

    public Views getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(Views viewsInfo) {
        this.viewsInfo = viewsInfo;
    }
}