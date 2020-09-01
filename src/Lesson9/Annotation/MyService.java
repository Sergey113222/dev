package Lesson9.Annotation;

import java.util.Objects;

@Version(version = 8.0, code = "sss1")
public class MyService {
    private double version;
    private String code;

    public MyService(double version, String code) {
        this.version = version;
        this.code = code;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return Double.compare(myService.version, version) == 0 &&
                Objects.equals(code, myService.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, code);
    }

    private void thisClassInfo() {
        System.out.println("MyService{" +
                "version=" + version +
                ", code='" + code + '\'' +
                '}');
    }
}
