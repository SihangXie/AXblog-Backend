/*
 * Copyright (c) 2022 Axblog's Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.axblog.common.constant;

public class RedisConstant {

    // Redis空值的有效时间，解决缓存穿透问题
    public static final Long CACHE_NULL_TTL = 2L;

    public static final String CACHE_WEBSITE_LOGIN_KEY = "website:login:";

}
