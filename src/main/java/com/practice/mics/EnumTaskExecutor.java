package com.practice.mics;

import java.util.*;

class EnumTaskExecutor {
    public static void main(String[] args) {
        TaskExecutor t1 = new TaskExecutor();
        t1.addTask(EcomOrderLifecycleEnum.A, () -> System.out.println("execute A"))
                .addTask(EcomOrderLifecycleEnum.B, () -> System.out.println("Execute B"))
                .addTask(EcomOrderLifecycleEnum.C, () -> System.out.println("Execute C"))
                .addTask(EcomOrderLifecycleEnum.D, () -> System.out.println("Execute D"))
                .execute(EcomOrderLifecycleEnum.E);
    }

}

class TaskExecutor {
    HashMap<EcomOrderLifecycleEnum, Runnable> m = new HashMap();

    public TaskExecutor addTask(EcomOrderLifecycleEnum key, Runnable runnable) {
        m.put(key, runnable);
        return this;
    }

    public void execute(EcomOrderLifecycleEnum key) {
        List<EcomOrderLifecycleEnum> values = Arrays.asList(EcomOrderLifecycleEnum.values());
        Collections.sort(values, Comparator.comparingInt(EcomOrderLifecycleEnum::getVal));
        for (EcomOrderLifecycleEnum value : values) {
            if (value.getVal() >= key.getVal()) {
                Runnable runnable = m.get(value);
                if (Objects.nonNull(runnable))
                    runnable.run();
            }
        }
    }

}

enum EcomOrderLifecycleEnum {
    A(1),
    B(10),
    C(20),
    D(5),
    E(5);

    int val;

    EcomOrderLifecycleEnum(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}

