package top.meethigher.logmonitorembedded.service;



import top.meethigher.logmonitorembedded.dto.logmonitor.DownloadLogRequest;
import top.meethigher.logmonitorembedded.dto.logmonitor.QueryLogRequest;
import top.meethigher.logmonitorembedded.exception.CommonException;

import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @author chenchuancheng
 * @since 2021/12/6 9:37
 */
public interface LogMonitorService {
    /**
     * 查询日志
     *
     * @param request
     * @return
     */
    List<String> queryLog(QueryLogRequest request) throws CommonException;

    /**
     * 下载日志文件
     *
     * @param request
     * @return
     */
    String downloadLog(DownloadLogRequest request, HttpServletResponse response) throws CommonException, UnsupportedEncodingException;
}
