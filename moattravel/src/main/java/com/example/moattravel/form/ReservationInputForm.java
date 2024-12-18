package com.example.moattravel.form;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data

public class ReservationInputForm {
	@NotBlank(message = "チェックイン日とチェックアウト日を選択してください。")
	private String fromCheckinDateToCheckoutDate;

	@NotNull(message = "宿泊人数を入力してください。")
	private Integer numberOfPeople;

	//チェックイン日を取得する
	public LocalDate getCheckinDate() {
		try {
			String[] checkinDateAndCheckoutDate = getFromCheckinDateToCheckoutDate().split("から");
			return LocalDate.parse(checkinDateAndCheckoutDate[0].trim());
		} catch (Exception e) {
			throw new IllegalArgumentException("チェックイン日が不正です：" + getFromCheckinDateToCheckoutDate(), e);
		}
	}

	//チェックアウト日を取得する

	public LocalDate getCheckoutDate() {
		try {
			String[] checkinDateAndCheckoutDate = getFromCheckinDateToCheckoutDate().split("から");
			return LocalDate.parse(checkinDateAndCheckoutDate[1].trim());
		} catch (Exception e) {
			throw new IllegalArgumentException("チェックイン日が不正です：" + getFromCheckinDateToCheckoutDate(), e);
		}
	}

}
