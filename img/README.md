# 🐦 OMOKNOONE

오목눈이 사이트 간단 소개

##  🐦 팀명 : 오목눈이

##  🙂 팀원

- 팀원 : **최종찬**
[<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">](https://github.com/CJC0512)
- 팀원 : **이재원**
[<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">](https://github.com/jlee38266)
- 팀원 : **장민석**
[<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">](https://github.com/ms1011)
- 팀원 : **조예린**
[<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">](https://github.com/orlzlL)
- 팀원 : **지현근**
[<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">](https://github.com/jihyeongeun)


##  📝 프로젝트 개요

### 1. 프로젝트 소개

프로젝트 소개

### 2. 프로젝트 필요성

프로젝트 필요성


### 3. 프로젝트 주요 기능

프로젝트 주요 기능

##  🧑‍💻 기술스택
<div align="center">

|DA#|ubuntu|mariaDB|JPA|Mybatis|
|---|---|---|---|---|
|<img src="https://github.com/beyond-sw-camp/be04-1st-4goda-vite/blob/main/PNG/Readme/da%23.png" height="150" />|<img src="https://github.com/beyond-sw-camp/be04-1st-4goda-vite/blob/main/PNG/Readme/ubuntu.png" height="150" />|<img src="https://github.com/beyond-sw-camp/be04-1st-4goda-vite/blob/main/PNG/Readme/mariadb.png" height="150" />|<img src="https://github.com/OmokNoonE/OmokNoonE/blob/feature/project/schedule/JPA.png" height="150" />|<img src="https://github.com/OmokNoonE/OmokNoonE/blob/feature/project/schedule/mybatis.jpg" height="150" />

</div>

##  📃 WBS

[WBS 바로가기](https://docs.google.com/spreadsheets/d/1YxT_lA8VaVXNsjbl9au3YW109yCLpxz5oe4L39z-LwM/edit#gid=1027017419)
<p align="center"><img src=""/></p>

##  📖 요구사항
<details>
<summary><b>Omok 세부정책</b></summary>
    
- 세부정책
  
</details>

[요구사항 명세서 바로가기](https://docs.google.com/spreadsheets/d/1YxT_lA8VaVXNsjbl9au3YW109yCLpxz5oe4L39z-LwM/edit#gid=0)
<p align="center"><img src=""/></p>

##  📋 DDD

### 1. Event Stroming
<img src="https://github.com/OmokNoonE/OmokNoonE/blob/feature/project/schedule/evnet-stroming.jpg"/>

### 2. Context Map
<img src="https://github.com/OmokNoonE/OmokNoonE/blob/feature/project/schedule/context-map.jpg"/>

##  📗 DB 모델링

### 1. 개념 모델링
<p align="center"><img src="개념모델링 사진"/></p>

### 2. 논리 모델링(Barker 표기법)
<p align="center"><img src="https://github.com/OmokNoonE/OmokNoonE/blob/feature/project/schedule/logic-model.png"/></p>

### 3. 물리 모델링
<p align="center"><img src="물리모델링 사진"/></p>

##  📁 DDL
<details>
<summary><b>Omok DDL</b></summary>
    
```
CREATE TABLE `PROJECT_TEAM`
(
    `PROJECT_TEAM_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `MAX_MEMBER`    INTEGER NOT NULL,
    `CURRENT_MEMBER`    INTEGER NOT NULL,
    `TEAM_NAME`    VARCHAR(50) NOT NULL,
    `ADDED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `IS_ACTIVE`    BOOLEAN DEFAULT FALSE NOT NULL,
 PRIMARY KEY ( `PROJECT_TEAM_ID` )
);


CREATE TABLE `NOTICE`
(
    `NOTICE_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `TITLE`    VARCHAR(50) NOT NULL,
    `CONTENT`    LONGTEXT NOT NULL,
    `POSTED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `LAST_MODIFIED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `IS_DELETED`    BOOLEAN DEFAULT FALSE NOT NULL,
 PRIMARY KEY ( `NOTICE_ID` )
);


CREATE TABLE `REPLY`
(
    `REPLY_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `CONTENT`    LONGTEXT NOT NULL,
    `POSTED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `LAST_MODIFIED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `COMMENT_ID`    INTEGER NOT NULL,
    `IS_DELETED`    BOOLEAN DEFAULT FALSE NOT NULL,
    `MEMBER_ID`    VARCHAR(20) NOT NULL,
 PRIMARY KEY ( `REPLY_ID` )
);


CREATE TABLE `PERSONAL_LINK`
(
    `URL`    VARCHAR(255) NOT NULL,
    `MEMBER_ID`    VARCHAR(20) NOT NULL,
 PRIMARY KEY ( `URL`,`MEMBER_ID` )
);


CREATE TABLE `PROJECT_MEMBER`
(
    `PROJECT_MEMBER_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `MEMBER_ID`    VARCHAR(20) NOT NULL,
    `PROJECT_TEAM_ID`    INTEGER NOT NULL,
    `MEMBER_CATEGORY`    VARCHAR(255) NOT NULL,
 PRIMARY KEY ( `PROJECT_MEMBER_ID` )
);


CREATE TABLE `PROJECT`
(
    `PROJECT_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `TITLE`    VARCHAR(50) NOT NULL,
    `START_DATE`    VARCHAR(30) NOT NULL,
    `END_DATE`    VARCHAR(30),
    `LAST_MODIFIED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `STATUS`    VARCHAR(20) NOT NULL,
    `PROJECT_TEAM_ID`    INTEGER NOT NULL,
    `PROJECT_MEMBER_ID`    INTEGER NOT NULL,
    `IS_PUBLIC`    BOOLEAN DEFAULT TRUE NOT NULL,
 PRIMARY KEY ( `PROJECT_ID` )
);


CREATE TABLE `ISSUE`
(
    `ISSUE_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `TITLE`    VARCHAR(50) NOT NULL,
    `CONTENT`    LONGTEXT NOT NULL,
    `IS_CLOSED`    BOOLEAN DEFAULT FALSE NOT NULL,
    `POSTED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `CLOSED_DATE`    VARCHAR(30),
    `LAST_MODIFIED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `PROJECT_MEMBER_ID`    INTEGER NOT NULL,
    `PROJECT_ID`    INTEGER NOT NULL,
 PRIMARY KEY ( `ISSUE_ID` )
);


CREATE TABLE `BOOKMARK`
(
    `BOOKMARK_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `IS_LIKE`    BOOLEAN DEFAULT FALSE NOT NULL,
    `IS_BOOKMARK`    BOOLEAN DEFAULT FALSE NOT NULL,
    `ADDED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `SEEKING_MEMBER_POST_ID`    INTEGER NOT NULL,
    `MEMBER_ID`    VARCHAR(20) NOT NULL,
 PRIMARY KEY ( `BOOKMARK_ID` )
);


CREATE TABLE `SCHEDULE`
(
    `SCHEDULE_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `START_DATE`    VARCHAR(30) NOT NULL,
    `END_DATE`    VARCHAR(30),
    `TITLE`    VARCHAR(50) NOT NULL,
    `CONTENT`    LONGTEXT NOT NULL,
    `PROGRESS`    FLOAT DEFAULT 0 NOT NULL,
    `LAST_MODIFIED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `PROJECT_MEMBER_ID`    INTEGER NOT NULL,
    `PROJECT_ID`    INTEGER NOT NULL,
 PRIMARY KEY ( `SCHEDULE_ID` )
);


CREATE TABLE `POST`
(
    `POSTING_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `TITLE`    VARCHAR(50) NOT NULL,
    `CONTENT`    LONGTEXT NOT NULL,
    `POSTED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `HITS`    INTEGER DEFAULT 0 NOT NULL,
    `LAST_MODIFIED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `MEMBER_ID`    VARCHAR(20) NOT NULL,
    `IS_DELETED`    BOOLEAN DEFAULT FALSE NOT NULL,
 PRIMARY KEY ( `POSTING_ID` )
);


CREATE TABLE `PROFILE`
(
    `PROFILE_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `TILTLE`    VARCHAR(50) NOT NULL,
    `CONTENT`    LONGTEXT NOT NULL,
    `TECH_STACK`    VARCHAR(255),
    `MEMBER_ID`    VARCHAR(20) NOT NULL,
    `IS_DELETED`    BOOLEAN DEFAULT FALSE NOT NULL,
 PRIMARY KEY ( `PROFILE_ID` )
);


CREATE TABLE `COMMENT`
(
    `COMMENT_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `CONTENT`    LONGTEXT NOT NULL,
    `POSTED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `LAST_MODIFIED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `MEMBER_ID`    VARCHAR(20) NOT NULL,
    `IS_DELETED`    BOOLEAN DEFAULT FALSE NOT NULL,
    `COMMENT_CATEGORY`    VARCHAR(20) NOT NULL,
    `POSTING_ID`    INTEGER,
    `SEEKING_MEMBER_POST_ID`    INTEGER,
    `ISSUE_ID`    INTEGER,
 PRIMARY KEY ( `COMMENT_ID` )
);


CREATE TABLE `JOIN_WAITING_MEMBER`
(
    `JOIN_WAITING_MEMBER_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `PROJECT_TEAM_ID`    INTEGER NOT NULL,
    `MEMBER_ID`    VARCHAR(20) NOT NULL,
    `CATEGORY`    VARCHAR(10) NOT NULL,
    `JOIN_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
 PRIMARY KEY ( `JOIN_WAITING_MEMBER_ID` )
);


CREATE TABLE `MEMBER`
(
    `MEMBER_ID`    VARCHAR(20) NOT NULL,
    `NAME`    VARCHAR(30) NOT NULL,
    `NICKNAME`    VARCHAR(20),
    `PASSWORD`    VARCHAR(20) NOT NULL,
    `EMAIL`    VARCHAR(40),
    `PHONE_NUM`    VARCHAR(11),
    `ADDRESS`    VARCHAR(255),
    `BIRTHDAY`    VARCHAR(30),
    `SIGN_UP_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `IS_WITHDRAW`    BOOLEAN DEFAULT FALSE NOT NULL,
 PRIMARY KEY ( `MEMBER_ID` )
);


CREATE TABLE `SEEKING_MEMBER_POST`
(
    `SEEKING_MEMBER_POST_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `TITLE`    VARCHAR(50) NOT NULL,
    `SEEKING_MEMBER`    INTEGER NOT NULL,
    `START_DATE`    VARCHAR(30) NOT NULL,
    `END_DATE`    VARCHAR(30),
    `TECH_STACK`    VARCHAR(255),
    `CONTENT`    LONGTEXT NOT NULL,
    `LAST_MODIFIED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `IS_SEEKING`    BOOLEAN DEFAULT FALSE NOT NULL,
    `MEMBER_ID`    VARCHAR(20) NOT NULL,
    `IS_DELETED`    BOOLEAN DEFAULT FALSE NOT NULL,
    `PROJECT_ID`    INTEGER NOT NULL,
 PRIMARY KEY ( `SEEKING_MEMBER_POST_ID` )
);



ALTER TABLE `REPLY`
 ADD CONSTRAINT `REPLY_FK` FOREIGN KEY ( `COMMENT_ID` )
 REFERENCES `COMMENT` (`COMMENT_ID` );

ALTER TABLE `REPLY`
 ADD CONSTRAINT `REPLY_FK1` FOREIGN KEY ( `MEMBER_ID` )
 REFERENCES `MEMBER` (`MEMBER_ID` );



ALTER TABLE `PERSONAL_LINK`
 ADD CONSTRAINT `PERSONAL_LINK_FK` FOREIGN KEY ( `MEMBER_ID` )
 REFERENCES `MEMBER` (`MEMBER_ID` );



ALTER TABLE `PROJECT_MEMBER`
 ADD CONSTRAINT `PROJECT_MEMBER_FK` FOREIGN KEY ( `MEMBER_ID` )
 REFERENCES `MEMBER` (`MEMBER_ID` );

ALTER TABLE `PROJECT_MEMBER`
 ADD CONSTRAINT `PROJECT_MEMBER_FK1` FOREIGN KEY ( `PROJECT_TEAM_ID` )
 REFERENCES `PROJECT_TEAM` (`PROJECT_TEAM_ID` );



ALTER TABLE `PROJECT`
 ADD CONSTRAINT `PROJECT_FK` FOREIGN KEY ( `PROJECT_TEAM_ID` )
 REFERENCES `PROJECT_TEAM` (`PROJECT_TEAM_ID` );

ALTER TABLE `PROJECT`
 ADD CONSTRAINT `PROJECT_FK1` FOREIGN KEY ( `PROJECT_MEMBER_ID` )
 REFERENCES `PROJECT_MEMBER` (`PROJECT_MEMBER_ID` );



ALTER TABLE `ISSUE`
 ADD CONSTRAINT `ISSUE_FK` FOREIGN KEY ( `PROJECT_MEMBER_ID` )
 REFERENCES `PROJECT_MEMBER` (`PROJECT_MEMBER_ID` );

ALTER TABLE `ISSUE`
 ADD CONSTRAINT `ISSUE_FK1` FOREIGN KEY ( `PROJECT_ID` )
 REFERENCES `PROJECT` (`PROJECT_ID` );



ALTER TABLE `BOOKMARK`
 ADD CONSTRAINT `BOOKMARK_FK` FOREIGN KEY ( `SEEKING_MEMBER_POST_ID` )
 REFERENCES `SEEKING_MEMBER_POST` (`SEEKING_MEMBER_POST_ID` );

ALTER TABLE `BOOKMARK`
 ADD CONSTRAINT `BOOKMARK_FK1` FOREIGN KEY ( `MEMBER_ID` )
 REFERENCES `MEMBER` (`MEMBER_ID` );



ALTER TABLE `SCHEDULE`
 ADD CONSTRAINT `SCHEDULE_FK` FOREIGN KEY ( `PROJECT_MEMBER_ID` )
 REFERENCES `PROJECT_MEMBER` (`PROJECT_MEMBER_ID` );

ALTER TABLE `SCHEDULE`
 ADD CONSTRAINT `SCHEDULE_FK1` FOREIGN KEY ( `PROJECT_ID` )
 REFERENCES `PROJECT` (`PROJECT_ID` );



ALTER TABLE `POST`
 ADD CONSTRAINT `POST_FK` FOREIGN KEY ( `MEMBER_ID` )
 REFERENCES `MEMBER` (`MEMBER_ID` );



ALTER TABLE `PROFILE`
 ADD CONSTRAINT `PROFILE_FK` FOREIGN KEY ( `MEMBER_ID` )
 REFERENCES `MEMBER` (`MEMBER_ID` );



ALTER TABLE `COMMENT`
 ADD CONSTRAINT `COMMENT_FK` FOREIGN KEY ( `POSTING_ID` )
 REFERENCES `POST` (`POSTING_ID` );

ALTER TABLE `COMMENT`
 ADD CONSTRAINT `COMMENT_FK1` FOREIGN KEY ( `MEMBER_ID` )
 REFERENCES `MEMBER` (`MEMBER_ID` );

ALTER TABLE `COMMENT`
 ADD CONSTRAINT `COMMENT_FK2` FOREIGN KEY ( `SEEKING_MEMBER_POST_ID` )
 REFERENCES `SEEKING_MEMBER_POST` (`SEEKING_MEMBER_POST_ID` );

ALTER TABLE `COMMENT`
 ADD CONSTRAINT `COMMENT_FK3` FOREIGN KEY ( `ISSUE_ID` )
 REFERENCES `ISSUE` (`ISSUE_ID` );



ALTER TABLE `JOIN_WAITING_MEMBER`
 ADD CONSTRAINT `JOIN_WAITING_MEMBER_FK` FOREIGN KEY ( `PROJECT_TEAM_ID` )
 REFERENCES `PROJECT_TEAM` (`PROJECT_TEAM_ID` );

ALTER TABLE `JOIN_WAITING_MEMBER`
 ADD CONSTRAINT `JOIN_WAITING_MEMBER_FK1` FOREIGN KEY ( `MEMBER_ID` )
 REFERENCES `MEMBER` (`MEMBER_ID` );



ALTER TABLE `SEEKING_MEMBER_POST`
 ADD CONSTRAINT `SEEKING_MEMBER_POST_FK` FOREIGN KEY ( `MEMBER_ID` )
 REFERENCES `MEMBER` (`MEMBER_ID` );
```
</details>



## 📒 Mybatis 

### 1. 회원 조회
<details>
	<summary><b>회원 조회 기능</b></summary>
        <p><img src=""/></p>
	<p><img src=""/></p>
	</details>
</details> 


### 2. 프로젝트 조회
<details>
	<summary><b>프로젝트 조회 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 


### 3. 프로젝트 조회
<details>
	<summary><b>프로젝트 팀 조회 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 


### 4. 모집글 조회
<details>
	<summary><b>모집글글 조회 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 



## 📙 JPA

### 1. 회원

#### INSERT
<details>
	<summary><b>회원 INSERT 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 

#### UPDATE
<details>
	<summary><b>회원 UPDATE 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 

#### DELETE
<details>
	<summary><b>회원 DELETE 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 

### 2. 프로젝트

#### INSERT
<details>
	<summary><b>프로젝트 INSERT 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 
<details>
	<summary><b>일정 INSERT 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 
<details>
	<summary><b>일정 INSERT 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 
<details>
	<summary><b>모집글 INSERT 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 

#### UPDATE
<details>
	<summary><b>프로젝트 UPDATE 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 
<details>
	<summary><b>일정 UPDATE 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 
<details>
	<summary><b>일정 UPDATE 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 
<details>
	<summary><b>모집글 UPDATE 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 

#### DELETE
<details>
	<summary><b>프로젝트 DELETE 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 
<details>
	<summary><b>일정 DELETE 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 
<details>
	<summary><b>일정 DELETE 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 
<details>
	<summary><b>모집글 DELETE 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 

### 3. 프로젝트 팀

#### INSERT
<details>
	<summary><b>프로젝트 팀 INSERT 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 

#### UPDATE
<details>
	<summary><b>프로젝트 팀 UPDATE 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 

#### DELETE
<details>
	<summary><b>프로젝트 팀 DELETE 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 
<details>
	<summary><b>프로젝트 팀팀 구성원 DELETE 기능</b></summary>
         	<p><img src=""/></p>
	 	<p><img src=""/></p>
	</details>
</details> 

### eurekaServer

### Gateway

### JWT

### FeignClient


## 📃 단위테스트 결과 보고서

[단위테스트 결과보고서 바로가기](https://docs.google.com/spreadsheets/d/1YxT_lA8VaVXNsjbl9au3YW109yCLpxz5oe4L39z-LwM/edit#gid=1417392135)
<p align="center"><img src=""/></p>

## 📑주요 테스트 결과
<details>
	<summary><b>회원 ID로 회원이 작성한 이슈 조회</b></summary>
         <p><img src=""/></p>
	 <p><img src=""/></p>
	</details>
</details> 

## 📰 Project Architecture
<p align="center"><img src="https://github.com/OmokNoonE/OmokNoonE/blob/feature/project/schedule/omoknoone-project-architecture.png"/></p>

## 👫 회고
|&nbsp;&nbsp;팀&nbsp;원&nbsp;&nbsp;&nbsp;|회고록|
|:---:|---|
|최종찬|내용|
|이재원|내용|
|장민석|내용|
|조예린|내용|
|지현근|내용|
