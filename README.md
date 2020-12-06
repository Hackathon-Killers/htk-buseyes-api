# htk-buseyes-api
ICT 콤플랙스 앱/웹 개발 첼린지 공모전/ Spring boot Server




## 회원관련 api
### 1. 회원가입
#### Request  
```http
POST ~/signup
Content-Type: application/json 
```

| Paramter    | Description                                                  | Mandatory | Type   |
| ----------- | ------------------------------------------------------------ | --------- | ------ |
| `userId`    | 유저 ID                                                      | Y         | Int    |
| `password`  | 유저 비밀번호 (8자리 이상)                                   | Y         | String |
| `userType`  | 유저 유형 (피보호자 = 'W', 보호자 = 'G', 기사 = 'D')         | Y         | String |
| `partnerId` | 보호자 또는 피보호자의 ID (보호자일 경우는 피보호자, 또는 역 관계) | N         | Int    |

#### Response

| Status Code               | Description                            |
| ------------------------- | -------------------------------------- |
| 200 OK                    | 성공                                   |
| 400 Bad Request           | Parameter가 누락됐거나 형식이 맞지않음 |
| 500 Internal Server Error | 서버 에러                              |

**성공일 때 response body는 JSON 형식이며 예시는 아래와 같다.**

```json
{
  "userId": "hongildong123",
  "accessToken": "akflakdASkLSKnalsdkl~~",
  "isSuccess": true,
  "code": 200,
  "message": "회원가입 성공"
}
```
**실패일 때 response body는 JSON 형식이며 아래와 같다.**

```json
{
	"isSuccess": false,
	"code": 400,
	"message": "회원가입에 실패했습니다."
}
```
  
| Paramter      | Description | Mandatory | Type   |
| ------------- | :---------- | --------- | ------ |
| `userId`      | 유저 ID     | N         | Int    |
| `accessToken` | Jwt 토큰    | N         | String |
| `isSuccess`   | 성공여부    | Y         | Bool   |
| `code`        | 상태코드    | Y         | Int    |
| `message`     | 메세지      | Y         | String |
