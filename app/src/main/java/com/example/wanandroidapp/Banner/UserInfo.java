package com.example.wanandroidapp.Banner;

import java.util.List;

public class UserInfo {

    private DataDTO data;
    private int errorCode;
    private String errorMsg;

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataDTO {
        private CoinInfoDTO coinInfo;
        private CollectArticleInfoDTO collectArticleInfo;
        private UserInfoDTO userInfo;

        public CoinInfoDTO getCoinInfo() {
            return coinInfo;
        }

        public void setCoinInfo(CoinInfoDTO coinInfo) {
            this.coinInfo = coinInfo;
        }

        public CollectArticleInfoDTO getCollectArticleInfo() {
            return collectArticleInfo;
        }

        public void setCollectArticleInfo(CollectArticleInfoDTO collectArticleInfo) {
            this.collectArticleInfo = collectArticleInfo;
        }

        public UserInfoDTO getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(UserInfoDTO userInfo) {
            this.userInfo = userInfo;
        }

        public static class CoinInfoDTO {
            private int coinCount;
            private int level;
            private String nickname;
            private String rank;
            private int userId;
            private String username;

            public int getCoinCount() {
                return coinCount;
            }

            public void setCoinCount(int coinCount) {
                this.coinCount = coinCount;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getRank() {
                return rank;
            }

            public void setRank(String rank) {
                this.rank = rank;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }
        }

        public static class CollectArticleInfoDTO {
            private int count;

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }
        }

        public static class UserInfoDTO {
            private boolean admin;
            private List<?> chapterTops;
            private int coinCount;
            private List<?> collectIds;
            private String email;
            private String icon;
            private int id;
            private String nickname;
            private String password;
            private String publicName;
            private String token;
            private int type;
            private String username;

            public boolean isAdmin() {
                return admin;
            }

            public void setAdmin(boolean admin) {
                this.admin = admin;
            }

            public List<?> getChapterTops() {
                return chapterTops;
            }

            public void setChapterTops(List<?> chapterTops) {
                this.chapterTops = chapterTops;
            }

            public int getCoinCount() {
                return coinCount;
            }

            public void setCoinCount(int coinCount) {
                this.coinCount = coinCount;
            }

            public List<?> getCollectIds() {
                return collectIds;
            }

            public void setCollectIds(List<?> collectIds) {
                this.collectIds = collectIds;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public String getPublicName() {
                return publicName;
            }

            public void setPublicName(String publicName) {
                this.publicName = publicName;
            }

            public String getToken() {
                return token;
            }

            public void setToken(String token) {
                this.token = token;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }
        }
    }
}
