package builder.chain;

/**
 * 链式调用的建造者模式
 * 以奶茶为例
 */
public class MilkTea {
    private String type;
    private String size;
    private boolean pearl;
    private boolean ice;

    // 构造方法是私有的，因此只能通过 Builder 创建；
    private MilkTea(MilkTeaBuilder builder) {
        type = builder.type;
        size = builder.size;
        pearl = builder.pearl;
        ice = builder.ice;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public boolean isPearl() {
        return pearl;
    }

    public boolean isIce() {
        return ice;
    }

    @Override
    public String toString() {
        return "MilkTea{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", pearl=" + pearl +
                ", ice=" + ice +
                '}';
    }

    public static class MilkTeaBuilder {
        private String type;
        private String size = "medium";
        private boolean pearl = true;
        private boolean ice = false;

        public MilkTeaBuilder(String type) {
            this.type = type;
        }

        public MilkTeaBuilder size(String size) {
            this.size = size;
            return this;
        }

        public MilkTeaBuilder pearl(boolean pearl) {
            this.pearl = pearl;
            return this;
        }

        public MilkTeaBuilder ice(boolean ice) {
            this.ice = ice;
            return this;
        }

        public MilkTea build() {
            return new MilkTea(this);
        }
    }
}
