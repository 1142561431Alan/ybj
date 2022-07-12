package com.ntsybj.controller;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.ntsybj.common.annotation.SysLog;
import com.ntsybj.common.exception.YBJException;
import com.ntsybj.common.utils.PdfUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.html2pdf.resolver.font.DefaultFontProvider;
import com.itextpdf.layout.font.FontProvider;*/
import org.xhtmlrenderer.pdf.ITextFontResolver;
import org.xhtmlrenderer.pdf.ITextRenderer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Alan
 * @create 2022-06-28-10:32
 */
@Api(tags = "測試接口")
@RestController
@RequestMapping("test")
public class TestController {
    // 字体
    public static Font font = null;
    private static final String resourcesDir = System.getProperty("user.dir") + "/src/main/resources";

    static {
        try {
            BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H",BaseFont.NOT_EMBEDDED);
            font = new Font(bfChinese, 10, Font.BOLD);// 设置字体大小
            } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ApiOperation("测试调用")
    @SysLog("测试调用")
    @GetMapping("request")
    public void testRequest(){
        System.out.println("success");
    }

    @ApiOperation("异常测试")
    @SysLog("异常测试")
    @GetMapping("error")
    public void error(){
        System.out.println("error");
        throw new YBJException("测试异常");
    }

    @ApiOperation("测试生成pdf")
    @SysLog("测试生成pdf")
    @GetMapping("/createPdfFile")
    public void createPdfFile(){
        //测试生成pdf
        try{
            createPDF("D://hellowworld.pdf");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException, com.lowagie.text.DocumentException {
        //createPDF("D://hellowworld.pdf");
        html2pdf();
    }

    private static void html2pdf() throws IOException, com.lowagie.text.DocumentException {
        String path = resourcesDir + "/templates/template.html";
        String destPath = resourcesDir + "/templates/template.pdf";
        ITextRenderer renderer = new ITextRenderer();
        OutputStream os = new FileOutputStream(destPath);
        renderer.setDocument(new File(path));
        ITextFontResolver resolver = renderer.getFontResolver();
        //添加字体，解决中文不显示的问题
        resolver.addFont(resourcesDir + "/font/simsun.ttc", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
        renderer.layout();
        renderer.createPDF(os);
        os.close();
    }


    //pdf创建表格
    public static PdfPTable createTable(PdfWriter writer) throws DocumentException, IOException{
        //PdfPTable table = new PdfPTable(8);//生成一个两列的表格
        Boolean t = Boolean.TRUE;
        Boolean f = Boolean.FALSE;
        PdfPTable table = new PdfPTable(new float[]{40, 100});
        PdfPCell cell;
        //有中文文字的话需要设置字体
        //Font font = new Font(BaseFont.createFont("C:/Windows/Fonts/SIMYOU.TTF",BaseFont.IDENTITY_H,BaseFont.NOT_EMBEDDED),-1.0F,-1,BaseColor.RED);
        //Font font = new Font(BaseFont.createFont(),-1.0F,-1,BaseColor.RED);
        // 设置中文显示
        BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H",BaseFont.NOT_EMBEDDED);
        Font font = new Font(bfChinese, 11, Font.BOLD, BaseColor.RED);// 设置字体大小
        Font cnFont = new Font(bfChinese, 11, Font.BOLD);// 设置表字体
        int size = 30;
        // 新建单元格指定字体
        table  = PdfUtils.createCellByHeight("反馈单位", cnFont,30,table,t,t);
        table  = PdfUtils.createCellByHeight("深圳银保监", cnFont,30,table,f,t);
        table  = PdfUtils.createCellByHeight("反馈事项", cnFont,30,table,t,t);
        table  = PdfUtils.createCellByHeight("处罚信息", cnFont,30,table,f,t);
        table  = PdfUtils.createCellByHeight("被查询对象", cnFont,50,table,t,t);
        table  = PdfUtils.createCellByHeight("李四", cnFont,50,table,f,t);
        table  = PdfUtils.createCellByHeight("反馈事项", cnFont,30,table,t,t);
        table  = PdfUtils.createCellByHeight("处罚信息", cnFont,30,table,f,t);
        table  = PdfUtils.createCellByHeight("被查询对象", cnFont,50,table,t,t);
        table  = PdfUtils.createCellByHeight("李四", cnFont,50,table,f,t);
        /*cell = new PdfPCell(new Phrase("three"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("four"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("two"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("three"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("four"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("two"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("three"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("four"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("two"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("three"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("four"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("two"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("three"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("four"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("two"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("three"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("four"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("two"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("three"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("four"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        //合并单元格
       *//* cell = new PdfPCell(new Phrase("六6666",cnFont));
        cell.setColspan(2);//设置所占列数
        cell.setRowspan(2);//设置所占行数
        cell.setBorderColor(BaseColor.RED);
        cell.setBackgroundColor(BaseColor.GREEN);
        cell.setFixedHeight(size*2);//设置高度为标准高度的两倍
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        table.addCell(cell);*//*
        cell = new PdfPCell(new Phrase("1"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("2"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("3"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("4"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(""));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("1"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("2"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("3"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("4"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(""));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("1"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("2"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("3"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("4"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("5"));
        cell.setFixedHeight(size);
        table.addCell(cell);



        Phrase phrase1 = new Phrase();
        Chunk chunk1 = new Chunk("         YES");
        Chunk chunk2 = new Chunk("          NO");
        phrase1.add(chunk1);
        phrase1.add(chunk2);
        cell = new PdfPCell(phrase1);
        cell.setColspan(3);
        table.addCell(cell);*/
        return table;
    }

    //创建pdf文件
    public static void createPDF(String filename) throws IOException {
        Document document = new Document(PageSize.A4);
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filename));
            document.addTitle("example of PDF");
            document.open();
            Paragraph title = new Paragraph("银行业金融机构从业人员处罚信息变更申请表",font);
            title.setFont(font);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);
            Paragraph title2= new Paragraph(" ");
            document.add(title2);
            //document.add(new Paragraph("Hello World!"));
            PdfPTable table = createTable(writer);
            //PdfPTable table2 = createTable(writer);
            //PdfPTable table3 = createTable1(writer);
            //PdfPTable table4 = createTable2(writer);
           document.add(table);
            PdfPTable table1 = PdfUtils.createTable(80,8);
            document.add(table1);
            /*document.add(table2);
            document.add(table3);*/
            //document.add(table4);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }

    private static PdfPTable createTable2(PdfWriter writer) throws IOException, DocumentException {
        PdfPTable table = new PdfPTable(new float[]{80, 10, 70, 70, 70, 70,70,10});//生成一个两列的表格
        PdfPCell cell;
        int size = 30;
        BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H",BaseFont.NOT_EMBEDDED);

        Font tableFont = new Font(bfChinese, 8, Font.BOLD);// 设置表字体
        cell = new PdfPCell(new Phrase("具体修改内容",tableFont));

        cell.setColspan(1);//设置所占列数
        cell.setRowspan(13);//设置所占行数
        cell.setFixedHeight(size*2);//设置高度
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("two"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("three"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("four"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("two"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("three"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("four"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("two"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("three"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("four"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        return table;
    }

    private static PdfPTable createTable1(PdfWriter writer) throws IOException, DocumentException {
        PdfPTable table = new PdfPTable(new float[]{40, 120, 120, 120, 80, 80});//生成一个两列的表格
        PdfPCell cell;
        //有中文文字的话需要设置字体
        //Font font = new Font(BaseFont.createFont("C:/Windows/Fonts/SIMYOU.TTF",BaseFont.IDENTITY_H,BaseFont.NOT_EMBEDDED),-1.0F,-1,BaseColor.RED);
        //Font font = new Font(BaseFont.createFont(),-1.0F,-1,BaseColor.RED);
        // 设置中文显示
        BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H",BaseFont.NOT_EMBEDDED);
        Font font = new Font(bfChinese, 10, Font.BOLD, BaseColor.RED);// 设置字体大小
        Font tableFont = new Font(bfChinese, 8, Font.BOLD);// 设置表字体
        int size = 30;
        cell = new PdfPCell(new Phrase("你好，再见",font));
        cell.setFixedHeight(size);//设置高度
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("two"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("three"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("four"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        //合并单元格
        cell = new PdfPCell(new Phrase("六6666",tableFont));
        cell.setColspan(2);//设置所占列数
        cell.setRowspan(3);//设置所占行数
        cell.setBorderColor(BaseColor.RED);
        cell.setBackgroundColor(BaseColor.GREEN);
        cell.setFixedHeight(size*3);//设置高度为标准高度的两倍
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("six"));
        cell.setFixedHeight(size);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("seven"));

        cell.setFixedHeight(size);
        table.addCell(cell);

        Phrase phrase1 = new Phrase();
        Chunk chunk1 = new Chunk("         YES");
        Chunk chunk2 = new Chunk("          NO");
        phrase1.add(chunk1);
        phrase1.add(chunk2);
        cell = new PdfPCell(phrase1);
        cell.setColspan(3);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase("具体修改内容",tableFont));
        cell.setColspan(2);//设置所占列数
        cell.setRowspan(13);//设置所占行数

        cell.setFixedHeight(size*13);//设置高度为标准高度的两倍
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);//设置水平居中
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);//设置垂直居中
        table.addCell(cell);

        return table;
    }


}
