# SPRING ADVANCED

## 프로젝트 분석
### auth
- 회원가입 _ auth/signup
    - email
    - password
    - userRole
      - ADMIN, USER
- 로그인 _ auth/signin
  - email
  - password

## comment
- 댓글 생성 _ todos/{todosId}/comments
  - contents
- 댓글 조회 _ todos/{todosId}/comments
- 댓글 삭제 _ admin/comments/{commentId}

## manager
- 메니저 생성 _ todos/{todosId}/managers
  - managerUserId
- 메니저 조회 _ todos/{todosId}/managers
- 메니저 삭제 _ todos/{todosId}/managers/{managerId}

## todo
- todo 생성 _ todos
  - title
  - contents
- todo 전체 조회 _ todos (사이즈 10의 페이징)
- todo 단건 조회 _ todos/{todosId}

## user
- 유저 조회 _ users/{userId}
- 유저 수정 _ users (비밀번호 변경)
- 유저 수정 _ /admin/users/{userId} (유저 역할 변경)


## Lv 0. 에러 분석
 - 프로젝트 실행 시 오류가 발생 하여였고 JwtUtil에서 발생된 것으로 추정
 - 코드 분석 결과 이상이 없어보여 application.yml 파일 확인 중 리소스 패키지가 없는 것을 확인.
 - 해당 패키지 및 파일 재생성, 내용 삽입 후 프로젝트 동작 확인.