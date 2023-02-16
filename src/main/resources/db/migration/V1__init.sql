DROP TABLE if exists public.post;

CREATE TABLE public.post
(
    id        int8 NOT NULL,
    title     varchar(255) NULL,
    member_id int8 NULL,
    CONSTRAINT post_pkey PRIMARY KEY (id)
);