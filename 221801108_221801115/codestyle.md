# 代码规范
##### 一、缩进
* 缩进采用4个空格，禁止使用tab字符。
##### 二、变量命名
* 代码中的命名均不能以下划线或美元符号开始，也不能以下划线或美元符号结束。
* 代码中的命名严禁使用拼音与英文混合的方式，更不允许直接使用中文的方式。
* 成员变量、局部变量都统一使用lowerCamelCase风格，必须遵从驼峰形式。
##### 三、每行最多字符数
单行字符数限制不超过 120个，超出需要换行，换行时遵循如下原则： 
* 第二行相对第一行缩进 4个空格，从第三行开始，不再继续缩进。 
* 运算符与下文一起换行。 
* 方法调用的点符号与下文一起换行。 
* 在多个参数超长，逗号后进行换行。 
* 在括号前不要换行。
##### 四、函数最大行数
* 函数的规模尽量限制在100行以内。
说明：不包括注释和空格行。
##### 五、函数、类命名
* 方法名、参数名、成员变量、局部变量都统一使用lowerCamelCase风格，必须遵从驼峰形式。
* 类名使用UpperCamelCase风格，必须遵从驼峰形式，但以下情形例外：（领域模型的相关命名）DO / BO / DTO / VO等。
##### 六、常量
* 常量命名全部大写，单词间用下划线隔开，力求语义表达完整清楚，不要嫌名字长。
##### 七、空行规则
* 相对独立的程序块之间、变量说明之后必须加空行。
说明 ：
以下情况应该是用空行分开： 
1）函数之间应该用空行分开；
3）用空行将代码按照逻辑片断划分；
##### 八、注释规则
* 方法内部单行注释，在被注释语句上方另起一行，使用//注释。方法内部多行注释使用/* */注释，注意与代码对齐。
* 对方法进行注释时，在方法上方另起一行，使用/* */注释。
##### 九、操作符前后空格
* 值操作符、比较操作符、算术操作符、逻辑操作符、位域操作符，如“ =”、“ +=” 
“ >=”、“ <=”、“ +”、“ *”、“ %”、“ &&”、“ ||”、“ <<” 、“ ^” 等二元操作符的前后应当加空格。
* 一元操作符如“ !”、“ ~”、“ ++”、“ --”、“ &”（ 地址运算符） 等前后不加空格。
* 像“［ ］”、“ .”、“ ->” 这类操作符前后不加空格。
##### 十、其他规则
* 大括号的使用约定。如果是大括号内为空，则简洁地写成{}即可，不需要换行；
如果是非空代码块则：左大括号和右大括号都单独占一行。
* 左括号和后一个字符之间不出现空格；同样，右括号和前一个字符之间也不出现空格。
* if/for/while/switch/do等保留字与左右括号之间都必须加空格。
* 函数名之后不要留空格，紧跟左括号' ( ' ，以与关键字区别。
* 方法参数在定义和传入时，多个参数逗号后边必须加空格。
* ' , ' 之后要留空格。如果' ; ' 不是一行的结束符号 ，其后也要留空格。
