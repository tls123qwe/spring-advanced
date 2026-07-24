package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {

    // 요청 dto에 조건을 추가
    // 서버스 클래스에 코드가 간소화되어 가독성과 로직 코드만 존재 할 수 있게 한다.

    @NotBlank(message = "기존 비밀번호는 필수입니다.")
    private String oldPassword;

    @NotBlank(message = "새로운 비밀번호는 필수입니다.")
/*    @Size(min = 8, message = "비밀번호는 8자 이상이어야 합니다.")
    @Pattern( // 패턴을 쓰는걸 알고 있으나 조건 설정은 검색
            regexp = "^(?=.*[A-Z])(?=.*\\d)[A-Z\\d]+$",
            message = "비밀번호는 숫자 + 대문자로 이루어지 조합이어야합니다."
    )*/ // 이것도 하나라 수정가능하여 추가 수정
    @Pattern( // 패턴을 쓰는걸 알고 있으나 조건 설정은 검색
            regexp = "^(?=.*[A-Z])(?=.*\\d)[A-Z\\d]{8,}$",
            message = "비밀번호는 8자 이상이고 숫자 + 대문자로 이루어지 조합이어야 합니다."
    )
    private String newPassword;
}
