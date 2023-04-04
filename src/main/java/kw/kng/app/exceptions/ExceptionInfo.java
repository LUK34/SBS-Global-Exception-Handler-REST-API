package kw.kng.app.exceptions;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ExceptionInfo
{
	private String code;
	private String msg;
	private String layer;
	private String path;
	private String nmofclss;
	private LocalDateTime dt;

}

/*
 This is a binding class to pass all the values to AppExceptionHandle(Global Exception Handler)
 */