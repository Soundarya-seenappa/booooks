package com.bookapi.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
@Getter
@Setter
public class response {
    int code;
    String message;
    Object obj;
}