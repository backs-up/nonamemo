# Nonamemo
너(No)와 나(Na)의 메모, 지식을 노나(Nona)주는 노나메모 

[로고는 곧 만들 예정]


------
<br />

### About Nonamemo

#### *노나메모는 Chrome Extension 으로, 검색 결과 화면 오른쪽 편에 간단히 메모를 할 수 있는 서비스입니다.*

<br />

#### 노나메모의 기능

<br />

##### 1. 검색 결과 화면 오른쪽 편에 **나**만의 메모를 할 수 있다.
> 나만 보기(Private Mode) 기능
> 사진은 1개만 첨부 가능

##### 2. 내가 메모한 것을 Public으로 공개할 수 있다 (**너**에게 공유)
> 단, Public으로 공개할 시, 120자 까지만 공개된다.
> Public으로 올린 메모는 다른사람이 즐찾(Star⭐️ icon 클릭)을 통해 메모를 저장할 수 있다.
> > 많이 클리핑된 메모는 인기순 Sorting(최신순/인기순 2개가 있음) 목록 상단에 보여진다
> Pagination 을 통해 다양한 메모들을 볼 수 있다

##### 3. 회원가입을 받기 위한 웹이 만들어진다.
> 이 웹에서 내가 쓴 메모들을 볼 수 있다.
> 내가 즐찾한 메모들도 볼 수 있다.


이상, 너(No)와 나(Na)의 메모, Nonamemo의 Service Description이었습니다.

<br />

-------

<br />

#### Nonamemo 프로토타이핑 (ing)

##### Figma를 통해 Prototyping 진행중
[Figma - Nonamemo Prototyping](https://www.figma.com/file/wDnzaSLSLHILPnWuo0JWMG/Untitled?node-id=7%3A3, "figma link")


<br />

20201003 Meeting 진행

> 노나메모 기능 수정
> 
>> [주소창 옆 shortcut icon 클릭시 팝업]
>> 1. 사이트 URL 과 자신의 의견(메모) clip하여 남김
>> 2. 다른 유저에게 모두 공유
>> 3. 유저의 의견 history를 볼 수 있음
>> star 마크 수에 따라 정렬
>> 


#### DB Schema 및 Architecture (ing)

```
account
{
    id:,
    email:,
    pwd:,
    reg_dtm:,
}

memo
{
    uid:,
    id:,
    cnt:,
    like_uid:[id1,id2],
    is_public:,
    reg_dtm:,
    mod_dtm:,
    keyword:[],
}

```

<br/>

##### MQ로 Kafka 이용 

- Like로 인기있는 메모들 실시간 업데이트 





