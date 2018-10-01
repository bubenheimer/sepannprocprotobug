package org.bubenheimer.sepannprocprotobug;

import dagger.Module;
import dagger.Provides;

@Module
abstract class SomeModule {
    @Provides
    static Integer someThing() {
        return 0;
    }
}
